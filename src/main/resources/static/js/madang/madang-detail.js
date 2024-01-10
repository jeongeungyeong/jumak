let madangNumber = document.getElementById("madangNumber").value;

// 페이지 진입시 카운트 뿌리기, 페이지 진입시 리플 뿌리기
enterPage();


{   // 댓글 작성 처리
    let $writeBtn = document.querySelector('.reply__write-btn');

    $writeBtn.addEventListener('click', function () {
        let $replyContent = document.getElementById('reply-content');
        let content = $replyContent.value;
        // console.log(content);

        fetch("/replies", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                madangReplyContent: content,
                madangNumber: madangNumber
            }),
        })
            .then(() => {
                $replyContent.value = '';
                enterPage();
            })
            .catch(console.log);
    });
}


{   // 댓글 수정
    let $replyUl = document.querySelector('.reply__list-ul');

    // 댓글 수정 버튼 처리
    $replyUl.addEventListener('click', (e) => {
        if (!e.target.classList.contains('reply__modify-btn')) {
            return;
        }


        let replyNumber = e.target.dataset.num;
        let $li = e.target.closest('li');
        let $newChild = document.createElement('div');
        let $oldChild = e.target.closest('li')
            .querySelector('.reply__content');

        let html = `
        <section class="reply__update">
            <div class="reply__write-box">
                <textarea name="replyContent" class="reply-update-content"
                          placeholder="댓글 내용을 입력하세요">${$oldChild.innerText}</textarea>
                <button type="button" class="reply__update-btn" data-num="${replyNumber}">
                  확인
                </button>
            </div>
        </section>
        `;

        $newChild.innerHTML = html;

        $li.replaceChild($newChild, $oldChild);
    });

    // 댓글 수정 처리
    $replyUl.addEventListener('click', (e) => {
        if (!e.target.classList.contains('reply__update-btn')) {
            return;
        }
        // console.log('update!!');

        let $li = e.target.closest('li');
        let content = $li.querySelector('.reply-update-content').value;
        let replyNumber = e.target.dataset.num;
        // console.log(content);
        // console.log(replyNumber);

        fetch(`/replies/${replyNumber}`,
            {
                method: 'PATCH',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    madangReplyContent: content
                })
            })
            .then(enterPage)
            .catch(console.log)
    });
}


{   // 댓글 삭제

    let $replyUl = document.querySelector('.reply__list-ul');

    $replyUl.addEventListener('click', (e) => {
        let replyNumber = e.target.dataset.num;

        if (!e.target.classList.contains('reply__remove-btn')) {
            return;
        }

        fetch(`/replies/${replyNumber}`, {
            method: 'DELETE'
        }).then(enterPage)
            .catch(console.log);

    });
}

{   //추천하기 버튼
    let $recommendBtn = document.querySelector('.reply__recommend-btn');

    $recommendBtn.addEventListener('click', function () {
        fetch(`/madangs/recommend/${madangNumber}`, {
            method: 'POST'
        }).then(resp => {
            if (!resp.ok) {
                return resp.text()
                    .then(text => {
                        throw new Error(text);
                    });
            }
            return resp.text();
        })
            .then(alert)
            .catch(err => {
                alert(err.message);
            });
    });
}

{   // 목록 버튼 처리
    let $goBack = document.querySelector('.go-back > button');
    $goBack.addEventListener('click', function () {
        location.href = '/madang/list';
    });
}

/**
 * 리플 count와 추천 count를 화면에 뿌리는 함수
 *
 * @param obj 리플 count와 추천 count를 가진 json데이터
 */
function displayReplyAndRecommendedCount(obj) {
    let $replyCount = document.querySelector('.reply__count > strong');
    let $recommendedCount = document.querySelector('.reply__recommended-count > strong');

    $replyCount.innerText = obj.replyCount;
    $recommendedCount.innerText = obj.recommendedCount;
}

/**
 * 댓글 리스트를 전달받아 화면에 뿌리는 함수
 *
 * @param list 댓글 리스트
 */
function displayReplyList(list) {
    let $replyUl = document.querySelector('.reply__list-ul');
    let loginUserNumber = $replyUl.dataset.num;
    let html = ``;

    list.forEach(ele => {
        html += `
          <li>
            <strong class="reply__writer">${ele.userNickname}</strong>
            <span class="reply__date">${ele.madangReplyDate}</span>
            <p class="reply__content">${ele.madangReplyContent}</p>
            <!--이 버튼은 로그인 한 회원만 보이기 -->
            ${loginUserNumber == ele.userNumber ?
            `
                <button type="button" class="reply__modify-btn" data-num="${ele.madangReplyNumber}">수정</button>
                <button type="button" class="reply__remove-btn" data-num="${ele.madangReplyNumber}">삭제</button>
                `
            : ``}
      
          </li>
       `
    });

    $replyUl.innerHTML = html;
}

/**
 * 페이지 진입시 실행할 함수
 */
function enterPage() {
    // 페이지 진입시 카운트 뿌리기
    fetch(`/replies/count?madangNumber=${madangNumber}`, {method: 'get'})
        .then(response => response.json())
        .then(displayReplyAndRecommendedCount)
        .catch(err => console.log("err : ", err));

    // 페이지 진입시 리플 뿌리기
    fetch(`/replies/list/${madangNumber}`)
        .then(resp => resp.json())
        .then(displayReplyList)
        .catch(err => console.log("err : ", err));
}
package com.example.jumak.service.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.myPage.OrderStatusVo;
import com.example.jumak.mapper.mypage.MypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MypageService {
    private final MypageMapper mypageMapper;


    //회원 이름 조회
    public String findUserName(Long userNumber) {
        return mypageMapper.selectName(userNumber);
    }

//    보드 작성 개수 조회
    public Long findBoardCount(Long userNumber) {
        return mypageMapper.selectBoardCount(userNumber);
    }

//    댓글 수 조회
    public Long findReplyCount(Long userNumber) { return mypageMapper.selectReplyCount(userNumber);}

//    배송 상태 조회
    public List<OrderStatusVo> findOrderStatusCount(Long userNumber) {
        return mypageMapper.selectOrderStatusCount(userNumber);
    }

    public List<OrderStatusVo> findOrderCancelStatusCount(Long userNumber){
        List<OrderStatusVo> statusVoList = mypageMapper.selectOrderCancelStatusCount(userNumber);

//        List<OrderStatusVo> resultList = new ArrayList<>();
//        Long returnCnt = 0L;
//        Long exchangeCnt = 0L;
//
//        for (OrderStatusVo orderStatusVo : statusVoList) {
//            OrderStatusVo vo = new OrderStatusVo();
//            Long status = orderStatusVo.getOrderStatusNumber();
//            Long count = orderStatusVo.getCount();
//            if(status == 7){
//                vo.setOrderStatusNumber(7L);
//                vo.setCount(count);
//                resultList.add(vo);
//            }else if(status == 8 || status == 9){
//                returnCnt += vo.getCount();
//            }else {
//                exchangeCnt += vo.getCount();
//            }
//        }
//
//        OrderStatusVo returnVo = new OrderStatusVo();
//        OrderStatusVo exchangeVo = new OrderStatusVo();
//
//        returnVo.setOrderStatusNumber(8L);
//        returnVo.setCount(returnCnt);
//        resultList.add(returnVo);
//
//        exchangeVo.setOrderStatusNumber(10L);
//        exchangeVo.setCount(exchangeCnt);
//        resultList.add(exchangeVo);

        return statusVoList;
    }


    public void register(UserDto userDto) {
        mypageMapper.insert(userDto);
    }


}

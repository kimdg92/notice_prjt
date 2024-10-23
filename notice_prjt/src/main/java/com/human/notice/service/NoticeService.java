package com.human.notice.service;

import java.util.List;

import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

public interface NoticeService {
    List<NoticeVO> getNoticeList(SearchVO searchVO) throws Exception;
    NoticeVO getNotice(int nIdx) throws Exception;
    void insertNotice(NoticeVO notice) throws Exception;
    void updateNotice(NoticeVO notice) throws Exception;
    void deleteNotice(int nIdx) throws Exception;
}

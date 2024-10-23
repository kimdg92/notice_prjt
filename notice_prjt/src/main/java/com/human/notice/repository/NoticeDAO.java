package com.human.notice.repository;

import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;
import java.util.List;

public interface NoticeDAO {
    List<NoticeVO> getNoticeList(SearchVO searchVO) throws Exception;
    NoticeVO getNotice(int nIdx) throws Exception;
    void insertNotice(NoticeVO notice) throws Exception;
    void updateNotice(NoticeVO notice) throws Exception;
    void deleteNotice(int nIdx) throws Exception;
}

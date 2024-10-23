package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getNoticeList(SearchVO searchVO) throws Exception {
        return noticeDAO.getNoticeList(searchVO);
    }

    @Override
    public NoticeVO getNotice(int nIdx) throws Exception {
        return noticeDAO.getNotice(nIdx);
    }

    @Override
    public void insertNotice(NoticeVO notice) throws Exception {
        noticeDAO.insertNotice(notice);
    }

    @Override
    public void updateNotice(NoticeVO notice) throws Exception {
        noticeDAO.updateNotice(notice);
    }

    @Override
    public void deleteNotice(int nIdx) throws Exception {
        noticeDAO.deleteNotice(nIdx);
    }
}

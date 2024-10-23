package com.human.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    // 공지사항 목록
    @RequestMapping("/list")
    public String getNoticeList(@ModelAttribute("searchVO") SearchVO searchVO, Model model) throws Exception {
        List<NoticeVO> noticeList = noticeService.getNoticeList(searchVO);
        model.addAttribute("noticeList", noticeList);
        return "notice/notice_list"; // JSP 경로: /WEB-INF/views/notice/notice_list.jsp
    }

    // 공지사항 상세보기
    @GetMapping("/view/{nIdx}")
    public String getNotice(@PathVariable("nIdx") int nIdx, Model model) throws Exception {
        NoticeVO notice = noticeService.getNotice(nIdx);
        model.addAttribute("notice", notice);
        return "notice/notice_view"; // JSP 경로: /WEB-INF/views/notice/notice_view.jsp
    }

    // 공지사항 작성 폼 이동
    @GetMapping("/write")
    public String writeNoticeForm(Model model) {
        return "notice/notice_write"; // JSP 경로: /WEB-INF/views/notice/notice_write.jsp
    }

    // 공지사항 작성
    @PostMapping("/write")
    public String insertNotice(@ModelAttribute NoticeVO noticeVO) throws Exception {
        noticeService.insertNotice(noticeVO);
        return "redirect:/notice/list";
    }

    // 공지사항 수정 폼 이동
    @GetMapping("/edit/{nIdx}")
    public String editNoticeForm(@PathVariable("nIdx") int nIdx, Model model) throws Exception {
        NoticeVO notice = noticeService.getNotice(nIdx);
        model.addAttribute("notice", notice);
        return "notice/notice_edit"; // JSP 경로: /WEB-INF/views/notice/notice_edit.jsp
    }

    // 공지사항 수정
    @PostMapping("/edit")
    public String updateNotice(@ModelAttribute NoticeVO noticeVO) throws Exception {
        noticeService.updateNotice(noticeVO);
        return "redirect:/notice/list";
    }

    // 공지사항 삭제
    @GetMapping("/delete/{nIdx}")
    public String deleteNotice(@PathVariable("nIdx") int nIdx) throws Exception {
        noticeService.deleteNotice(nIdx);
        return "redirect:/notice/list";
    }
}

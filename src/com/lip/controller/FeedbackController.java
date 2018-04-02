package com.lip.controller;

import com.lip.pojo.Feedback;
import com.lip.pojo.result.RequestResult;
import com.lip.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    public FeedBackService feedBackService;

    @ResponseBody
    @RequestMapping("/commit")
    public RequestResult commitFeedbackinfo(Feedback feedback){
        return feedBackService.commitFeedBack(feedback);
    }
}

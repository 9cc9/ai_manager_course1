package org.uestc.weglas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.uestc.weglas.core.model.Conversation;
import org.uestc.weglas.core.model.ConversationChatDetail;
import org.uestc.weglas.core.service.ChatService;
import org.uestc.weglas.core.service.ConversationService;
import org.uestc.weglas.util.BaseResult;


/**
 * @author yingxian.cyx
 * @date Created in 2024/10/11
 */
@RestController
@RequestMapping("/conversations")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @Autowired
    private ChatService chatService;


    /**
     * TODO 返回会话列表
     *
     * @param model
     * @return
     */
    @GetMapping("/list.json")
    public BaseResult<Conversation> queryAll(Model model) {
        return BaseResult.success(null);
    }

    /**
     * TODO 查询单条会话记录
     * @param model
     * @param conversationId
     * @return
     */
    @GetMapping("/detail.json")
    public BaseResult<Conversation> queryConversation(Model model, Integer conversationId) {
        return BaseResult.success(null);
    }

    /**
     * TODO 新建会话+第一条聊天记录
     *
     * @param conversation
     * @return
     */
    @PostMapping("/add.json")
    public BaseResult<Conversation> addConversation(@RequestBody Conversation conversation) {

        return BaseResult.success(null);
    }


    /**
     * TODO 新建一条聊天记录
     * @param chat
     * @return
     */
    @PostMapping("/addChat.json")
    public BaseResult<ConversationChatDetail> addChat(@RequestBody ConversationChatDetail chat) {

        return BaseResult.success(null);
    }


}

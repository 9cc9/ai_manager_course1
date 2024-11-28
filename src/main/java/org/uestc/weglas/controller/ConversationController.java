package org.uestc.weglas.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.uestc.weglas.core.model.Conversation;
import org.uestc.weglas.core.model.ConversationChatDetail;
import org.uestc.weglas.util.BaseResult;
import reactor.core.publisher.Flux;


/**
 * @author yingxian.cyx
 * @date Created in 2024/10/11
 */
@RestController
@RequestMapping("/conversations")
public class ConversationController {


    @GetMapping("/list.json")
    public BaseResult<Conversation> queryAll(Model model) {
        return BaseResult.success(null);
    }

    // 会话详情
    @GetMapping("/detail.json")
    public BaseResult<Conversation> queryConversation(Model model, Integer conversationId) {
        return BaseResult.success(null);
    }

    @PostMapping("/add.json")
    public BaseResult<Conversation> addConversation(@RequestBody Conversation conversation) {


        return BaseResult.success(null);
    }


    @PostMapping("/addChat.json")
    public BaseResult<ConversationChatDetail> addChat(@RequestBody ConversationChatDetail chat) {

        return BaseResult.success(null);
    }

    @PostMapping("/streamChat.json")
    public Flux<String> streamChat(@RequestBody ConversationChatDetail chat) {
        return null;
    }


}

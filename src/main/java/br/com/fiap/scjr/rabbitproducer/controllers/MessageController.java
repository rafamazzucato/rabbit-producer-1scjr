package br.com.fiap.scjr.rabbitproducer.controllers;

import br.com.fiap.scjr.rabbitproducer.senders.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private QueueSender sender;

    @GetMapping("/message")
    public String send(){
        sender.send("Mensagem a ser enviada para o Rabbit");
        return "Deu certo!";
    }
}

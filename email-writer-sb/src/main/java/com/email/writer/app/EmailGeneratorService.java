package com.email.writer.app;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmailGeneratorService {
 public String GenerateEmailReply(EmailRequest emailRequest){
     //BUILD THE PROMPT
     String prompt = BuildPrompt(emailRequest);

     //CRAFT A REQUEST
     Map<String,Object> RequestBody = Map.of(
             "contents" , new Object[] {
                     Map.of("parts", new Object[]{
                             Map.of("text",prompt)
                     })
             }
     );


     //DO REQUEST AND GET RESPONSE


     //RETURN RESPONSE

 }

    private String BuildPrompt(EmailRequest emailRequest) {
     StringBuilder prompt = new StringBuilder();
     prompt.append("Generate a Professional email reply for this email , please don't generate the subject");
     if(emailRequest.getTone()!=null && !emailRequest.getTone().isEmpty() ){
         prompt.append("Use a").append(emailRequest.getTone()).append("tone");
     }
     prompt.append("\n Original email: \n").append(emailRequest.getEmailContent());
     return prompt.toString();
    }
}

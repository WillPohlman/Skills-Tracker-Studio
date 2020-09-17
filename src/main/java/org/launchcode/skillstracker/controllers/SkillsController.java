package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController
{
    @GetMapping
    @ResponseBody
    public String homePage(){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>" +
                        "We have a few skills we would like to learn. Here is the list!" +
                        "</h2>" +
                            "<ol>" +
                                "<li>Java</li>" +
                                "<li>JavaScript</li>" +
                                "<li>HTML</li>" +
                            "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        String html =
                "<html>" +
                        "<body>" +
                            "<form method = 'post' action='/form'>" +
                                "<label for='name'>Name:</label>" +
                                "<input type = 'text' id='name' name = 'name'/>" +
                            "<br>" +
                                "<label for='one'>My favorite language:</label>" +
                                "<select id ='one' name='one'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='HTML'>HTML</option>" +
                                "</select>" +
                            "<br>" +

                            "<label for='two'>My second favorite language:</label>" +
                                "<select id ='two' name='two'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "</select>" +
                            "<br>" +

                            "<label for='three'>My third favorite language:</label>" +
                                "<select id ='three' name='three'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='HTML'>HTML</option>" +
                                "</select>" +

                            "<br>" +
                                "<input type = 'submit'>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String one, @RequestParam String two, @RequestParam String three){
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" +
                        name +
                        "</h1>" +
                        "<ol>" +
                            "<li>" + one + "</li>" +
                            "<li>" + two + "</li>" +
                            "<li>" + three + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}

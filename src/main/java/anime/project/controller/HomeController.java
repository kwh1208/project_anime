package anime.project.controller;

import anime.project.domain.Member;
import anime.project.service.MemberService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    MemberService memberService;

    @Autowired
    public HomeController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String Home(){
        return "home";
    }
    @PostMapping("/login")
    public String login(@RequestParam("id") String id,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model){
        Member member = memberService.login(id, password);
        session.setAttribute("member", member);

        return "home";
    }

    @GetMapping("/login")
    public String login_get(){
        return "login";
    }

    @GetMapping("/join")
    public String join(@RequestParam("member") Member member){
        memberService.join(member);
        return "join";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        memberService.logout(session);
        return "redirect:home";
    }
}

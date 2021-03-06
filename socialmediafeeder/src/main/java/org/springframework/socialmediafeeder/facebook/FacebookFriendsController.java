package org.springframework.socialmediafeeder.facebook;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class FacebookFriendsController {


    private final Facebook facebook;

    @Inject
    public FacebookFriendsController(Facebook facebook) {
        this.facebook = facebook;
    }

    @RequestMapping(value="/facebook/friends", method= RequestMethod.GET)
    public String showFeed(Model model) {
        model.addAttribute("friends", facebook.friendOperations().getFriendProfiles());
        return "facebook/friends";
    }
}

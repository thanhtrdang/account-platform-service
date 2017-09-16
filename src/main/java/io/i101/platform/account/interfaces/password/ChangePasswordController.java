package io.i101.platform.profile.interfaces.password;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChangePasswordController {
    public String changePassword(String username, String currentPassword, String newPassword) {

        return "";
    }

    // Changed password event
}
# profile-platform-service
    - Sign up
        - Username
        - Password
        - Salt
        - Email
        - First name
        - Last name
        - Phone
        - Socials: Facebook/Google/...
        - Activated
        - Locked
        - Organization
        - Roles
        - Permissions
    - Sign in
        - Username/Password/Attempts/Device/Sign in Time/Sign in Event
        - Socials: Facebook/Google/...
    - Forgot password
        - Request new password
            - Email: Send verification link (and/or code)
            - Phone: Send verification code (and/or link)
            - Expiration time
        - Create new password
            - Verification code
            - New password
        -> Changed password Event: Confirm updated password
            - Email
            - Phone
    - Change password
            - Username
            - Current password
            - New password
        -> Changed password Event: Confirm updated password
            - Email
            - Phone
    - Two steps

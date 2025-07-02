package com.sudila.microservice_user.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/api/v1/management")
@PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
public class ManagementController {

    @GetMapping
    @PreAuthorize("hasAuthority('admin:read') or hasAuthority('management:read')")
    public String get() {
        return "GET:: management controller";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('admin:create') or hasAuthority('management:create')")
    public String post() {
        return "POST:: management controller";
    }

    @PutMapping
    @PreAuthorize("hasAuthority('admin:update') or hasAuthority('management:update')")
    public String put() {
        return "PUT:: management controller";
    }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin:delete') or hasAuthority('management:delete')")
    public String delete() {
        return "DELETE:: management controller";
    }
}
package org.niit.notificationservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import netscape.javascript.JSObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackDTO {
    private String userId;
    private String notificationMessage;
    private JSObject jsObject;
}

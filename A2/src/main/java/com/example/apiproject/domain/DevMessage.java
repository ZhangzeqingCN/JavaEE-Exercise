package com.example.apiproject.domain;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class DevMessage {
    private String content;
    private Object data;

    public DevMessage(Object data) {
        this.data = data;
        this.content = data.getClass().getName();
    }
}

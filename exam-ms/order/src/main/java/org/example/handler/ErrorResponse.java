package org.example.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
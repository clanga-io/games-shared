package io.clanga.gamesshared.rng;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RngRequest {
    private String requestId;
    private List<RngDraw> rngDraws;
}

package io.clanga.gamesshared.rng;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RngDraw {
    private Integer numberOfDraws;
    private Integer minimum;
    private Integer maximum;
}

package notfound.ballog.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtTokenDto {
    private String grantType;       // "Bearer"

    private String accessToken;

    private String refreshToken;
}

package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {
    // The below line is needed only if we are serializing a java object (not needed if we are sending Java Text Message)
    static final long serialVersionUID = 3320286416319213457L;
    private UUID id;
    private String message;
}

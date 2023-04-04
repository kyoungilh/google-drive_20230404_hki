package googledrivehki.domain;

import googledrivehki.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String fileId;
    private String url;
}

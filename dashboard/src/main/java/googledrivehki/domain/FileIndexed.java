package googledrivehki.domain;

import googledrivehki.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String fileId;
    private List<String> keywords;
}

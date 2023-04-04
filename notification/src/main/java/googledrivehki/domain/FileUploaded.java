package googledrivehki.domain;

import googledrivehki.domain.*;
import googledrivehki.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;
}

package org.backend.viewmodel;

import lombok.*;
import org.backend.model.Note;
import org.backend.repository.NotebookRepository;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteViewModel {

    private final NotebookRepository notebookRepository = null ;

    private String id;

    @NotNull
    @Min(3)
    private String title;

    @NotNull
    private String text;

    @NotNull
    private String notebookId;

    private Date lastModifiedOn;
}

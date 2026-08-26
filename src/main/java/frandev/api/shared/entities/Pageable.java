package frandev.api.shared.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class Pageable <T>{
    private final List<T> data;
    private final int page;
    private final int lastPage;
    private  final int limit;
}
package by.domain.interaction.base;

import java.util.ArrayList;

/**
 * Created by Home911 on 28.09.2017.
 */

public interface UseCaseJson<InParam, OutParam> {

    ArrayList<OutParam> execute(InParam param);

}


/**
 * Varsha Bhanushali, 001234580, bhanushali.v@husky.neu.edu
 * Shrikant Mudholkar, 001284732, mudholkar.s@husky.neu.edu
 * Rahul Chandra, 01225683, chandra.ra@husky.neu.edu
 * Manish Patil, 001228956, patil.man@husky.neu.edu
 **/
package edu.neu.csye.useraccount.service.model;

import edu.neu.csye.tasks.service.model.TaskDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * A model of the user account domain object that is exposed to the public via an api.
 */
@Data
@AllArgsConstructor
@Builder
public class UserAccountDto {

    private String id;
    private String username;
    private String password;
    private Set<TaskDto> taskDtoSet;

    public UserAccountDto() {
        taskDtoSet = new HashSet<>();
    }
}

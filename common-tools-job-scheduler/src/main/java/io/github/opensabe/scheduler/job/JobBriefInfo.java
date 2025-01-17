package io.github.opensabe.scheduler.job;

import io.github.opensabe.scheduler.conf.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobBriefInfo {

    private String jobId;
    private String jobName;
    private boolean misfire;
    private String cronExpression;
    private JobStatus status;

}

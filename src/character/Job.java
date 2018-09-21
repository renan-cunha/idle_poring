package character;
import java.util.Map;
import java.util.HashMap;

abstract public class Job {
    private JobType job_type;

    public Job(JobType job_type) {
        this.job_type = job_type;
    }

    public String getJobType() {
        return job_type.get_Job();
    }

    abstract public void updateStats(Map attributes, Map stats);
}

package auto.from.spring.batch.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.job.SimpleJob;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:batch-context.xml" })
public class RunBatchTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void test() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		Job job = (Job) context.getBean("importPersonnes");

		JobParameters parameter = new JobParametersBuilder()
				.addDate("date", new Date())
//				.addString("input.file", "D://tmp/personnes.csv")
				.toJobParameters();

		jobLauncher.run(job, parameter);
	}

}

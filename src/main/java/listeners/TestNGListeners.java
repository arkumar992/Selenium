package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGListeners implements IAnnotationTransformer,IRetryAnalyzer{
	int max =1;
	@Override
	public void transform(ITestAnnotation arg0, @SuppressWarnings("rawtypes") Class arg1, @SuppressWarnings("rawtypes") Constructor arg2, Method arg3) {
		System.out.println(this.getClass());
		arg0.setRetryAnalyzer(this.getClass());
		//arg0.setInvocationCount(1);
		
}

	@Override
	public boolean retry(ITestResult arg0) {
		if(!arg0.isSuccess() && max < 2) {
			max++;
			System.out.println(max);
			return true;
		}
		
		return false;
	}
}
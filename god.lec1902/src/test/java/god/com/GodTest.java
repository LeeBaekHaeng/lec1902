package god.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

public class GodTest {

	@Test
	public void test() {
		System.out.println("test");

		RestTemplate restTemplate = new RestTemplate();

		String s = restTemplate.getForObject(
				"http://localhost:8080/lec1902/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_000000000001", String.class);

		System.out.println(s);
	}

	@Test
	public void test2() {
		System.out.println("test2");

		RestTemplate restTemplate = new RestTemplate();

		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
		interceptors.add(new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				HttpHeaders headers = request.getHeaders();

				List<MediaType> acceptableMediaTypes = new ArrayList<>();
				acceptableMediaTypes.add(MediaType.TEXT_HTML);
				headers.setAccept(acceptableMediaTypes);

				ClientHttpResponse response = execution.execute(request, body);

				return response;
			}
		});
		restTemplate.setInterceptors(interceptors);

		String s = restTemplate.getForObject(
				"http://localhost:8080/lec1902/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_000000000001", String.class);

		System.out.println(s);
	}

	@Test
	public void test3() {
		System.out.println("test3");

		RestTemplate restTemplate = new RestTemplate();

		List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
		interceptors.add(new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				HttpHeaders headers = request.getHeaders();

				List<MediaType> acceptableMediaTypes = new ArrayList<>();
				acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
				headers.setAccept(acceptableMediaTypes);

				ClientHttpResponse response = execution.execute(request, body);

				return response;
			}
		});
		restTemplate.setInterceptors(interceptors);

		String s = restTemplate.getForObject(
				"http://localhost:8080/lec1902/cop/bbs/selectBoardList.do?bbsId=BBSMSTR_000000000001", String.class);

		System.out.println(s);
	}

}

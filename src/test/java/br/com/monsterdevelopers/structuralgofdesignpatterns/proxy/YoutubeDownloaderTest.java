package br.com.monsterdevelopers.structuralgofdesignpatterns.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class YoutubeDownloaderTest {

	@Test
	public void testRenderVideoPage() {
		YoutubeDownloader naiveDownloader = new YoutubeDownloader(new YoutubeLibImpl());
		YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
		
		assertTrue(smart < naive);

	}
	
	private static long test(YoutubeDownloader downloader) {
		long startTime = System.currentTimeMillis();

		// User behavior in our app:
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");
		// Users might visit the same page quite often.
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderVideoPage("someothervid");

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}


}

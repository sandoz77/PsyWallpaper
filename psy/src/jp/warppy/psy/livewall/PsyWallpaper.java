package jp.warppy.psy.livewall;

import android.service.wallpaper.WallpaperService;

public class PsyWallpaper extends WallpaperService {
	/** Called when the activity is first created. */

	@Override
	public Engine onCreateEngine() {
		return new PsyEngine();
	}
	
	class PsyEngine extends Engine {
		
		private final Runnable mRun = new Runnable() {
			@Override
			public void run() {
				drawFrame();
			}
		};
		
		void drawFrame(){
			
		}
	}
}
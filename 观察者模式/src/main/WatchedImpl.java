package main;

import java.util.ArrayList;
import java.util.List;

public class WatchedImpl implements Watched {

	private List<observer> observers = new ArrayList<>();

	@Override
	public void addWatcher(observer watcher) {
		if (!observers.contains(watcher)) {
			observers.add(watcher);
		}

	}

	@Override
	public void removeWatcher(observer watcher) {
		if (observers != null && observers.contains(watcher)) {
			observers.remove(watcher);
		}

	}

	@Override
	public void notifyWatchers(String str) {
		for(observer ob: observers){
			ob.buyPhone(str);
		}

	}

}

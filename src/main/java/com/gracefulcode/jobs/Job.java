package com.gracefulcode.jobs;

import com.github.opengine.resource.Resource;
import java.util.HashMap;

public interface Job {
	public int getBaseTime();
	public HashMap<Resource, Integer> getInputs();
	public HashMap<Resource, Integer> getOutputs();
}
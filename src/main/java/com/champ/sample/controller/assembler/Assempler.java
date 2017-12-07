package com.champ.sample.controller.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.champ.sample.controller.resource.BaseResource;
import com.champ.sample.model.BaseModel;

public abstract class Assempler<M extends BaseModel, R extends BaseResource> {

	abstract public R toResource(M model);

	public List<R> toResourceList(List<M> models) {
		return models.stream().map(m -> toResource(m)).collect(Collectors.toList());
	}
}

package com.champ.sample.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.champ.sample.model.BaseModel;

public abstract class InMemoryRepository<T extends BaseModel> {

	private List<T> heap = Collections.synchronizedList(new ArrayList<>());

	public T create(T model) {

		model.setId(IdGenerator.ME.nextId());
		heap.add(model);

		return model;
	}

	public Optional<T> read(Long id) {
		return heap.stream().filter(m -> m.getId().equals(id)).findFirst();
	}

	public List<T> getAll() {
		return new ArrayList<>(heap);
	}

	public boolean update(Long id, T updated) {
		Optional<T> model = read(id);
		model.ifPresent(original -> updateIfExist(original, updated));
		return model.isPresent();
	}

	public boolean delete(Long id) {
		return heap.removeIf(model -> model.getId().equals(id));
	}

	protected abstract void updateIfExist(T original, T updated);
}

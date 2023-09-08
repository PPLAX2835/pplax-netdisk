package xyz.pplax.netdisk.core.exception;

import lombok.Getter;


@Getter
public class StorageSourceRefreshTokenException extends RuntimeException {

	private final Integer storageId;

	public StorageSourceRefreshTokenException(String message, Integer storageId) {
		super(message);
		this.storageId = storageId;
	}

	public StorageSourceRefreshTokenException(String message, Throwable cause, Integer storageId) {
		super(message, cause);
		this.storageId = storageId;
	}
}
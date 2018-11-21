package io.mosip.kernel.masterdata.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RegistrationCenterTypeRequestDto {
	private String id;
	private String ver;
	private LocalDateTime timestamp;
	private RegistrationCenterTypeRequest request;
}

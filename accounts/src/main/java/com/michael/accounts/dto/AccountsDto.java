package com.michael.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message ="AccountNumber cannot be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(

            description = "Account number of bank platform account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be null or empty")
    @Schema(

            description = "Account type of bank platform account", example = "Savings"
    )
    private String accountType;


    @Schema(
            description = "Bank branch address", example = "\"123 NewYork\""
    )
    @NotEmpty(message = "branch Address cannot be null or empty")
    private String branchAddress;
}

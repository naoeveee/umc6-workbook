package umc6.study.web.controller;

import lombok.*;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.web.bind.annotation.*;
import umc6.study.apiPayload.ApiResponse;
import umc6.study.converter.TempConverter;
import umc6.study.service.TempService.TempQueryService;
import umc6.study.web.dto.TempResponse;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    private final TempQueryService tempQueryService;

    @GetMapping("/test")
    public ResponseDto<TempResponse.TempTestDTO> testAPI(){

        return ResponseDto.onSuccess(TempConverter.toTempTestDTO(), Code.OK);
    }

    @GetMapping("/exception")
    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
    }
}
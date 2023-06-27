package academy.devdojo.mapper;

import academy.devdojo.domain.Producer;
import academy.devdojo.request.ProducerPostRequest;
import academy.devdojo.response.ProducerGetResponse;
import academy.devdojo.response.ProducerPostResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProducerMapper {
    //Criar uma instancia
    ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

    //Qual o retorno que eu quero primeiro?
    //ProducerPostRequest e gerar um Producer
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "id", expression = "java(java.util.concurrent.ThreadLocalRandom.current().nextLong(100_000))")
    Producer toProducer(ProducerPostRequest request);

    //E o proximo?
    //Producer e gerar um ProducerPostResponse
    ProducerPostResponse toProducerPostResponse(Producer producer);
    List<ProducerGetResponse> toProducerGetResponses(List<Producer> producers);
}

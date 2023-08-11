package com.pragma.RestaurantMarket.infrastructure.out.jpa.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pragma.RestaurantMarket.domain.model.OwnerModel;
import com.pragma.RestaurantMarket.infrastructure.input.rest.AdminRestController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AdminJpaAdapter.class)
public class AdminControllerTest {

    @Mock
    private AdminJpaAdapter adminService;

    @InjectMocks
    private AdminRestController adminController;

    @Test
    public void testCrearPropietario() throws Exception {
        OwnerModel ownerModel = new OwnerModel();
        // Inicializa ownerModel con los datos necesarios

        when(adminService.saveOwner(any(OwnerModel.class))).thenReturn(ownerModel);

        // Realiza una solicitud POST simulada al controlador
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(adminController).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/api/admin/crear-propietario")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(ownerModel)))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }
    // Método auxiliar para convertir objetos a JSON
    private static String asJsonString(final Object obj) {
        try {
            final ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
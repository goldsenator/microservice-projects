package kz.app.cart.shopping.controller;

import kz.app.cart.shopping.dto.CartDTO;
import kz.app.cart.shopping.model.Cart;
import kz.app.cart.shopping.service.ICartService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CartController {

    private final ICartService cartService;

    @PostMapping
    public ResponseEntity<Cart> create(@RequestBody CartDTO cartDTO) {
        return ResponseEntity.ok(cartService.save(cartDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getById(@PathVariable Long id){
        return ResponseEntity.ok(cartService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        cartService.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Cart>> getAll() {
        return ResponseEntity.ok(cartService.getAll());
    }
}

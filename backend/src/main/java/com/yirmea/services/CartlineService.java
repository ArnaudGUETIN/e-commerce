package com.yirmea.services;

import com.yirmea.dto.CartlineDTO;

public interface CartlineService {
    CartlineDTO updateQuantity(Long id);
    CartlineDTO deleteCartline(Long id);
    CartlineDTO getAllCartlines(Long id);
}

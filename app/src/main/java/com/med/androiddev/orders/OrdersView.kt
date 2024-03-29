package com.med.androiddev.orders

import com.med.domain.network.orders.model.Order

interface OrdersView {

    // Present tarafından View ilk oluşturma durumunda tetiklenir.
    fun initialiseView()

    // Siparişler isteği başarılı ise present tarafından view güncellenmesi durumunda tetiklenir.
    fun orderList(orders: List<Order>)

    // Siparişler isteğinden yanit beklenirken tetiklenir.
    fun showProgressBar(visibility: Int)

    // Kullaniciya uyari gosterilmesi durumunda tetiklenir.
    fun showAlert(messageId: Int)
}
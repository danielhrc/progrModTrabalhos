void checkOut(Recibo recibo){
        Moeda total = Moeda.zero;
        for(item : items) {
            total += item.getPreco();
            recibo.addItem(item);
        }
        Pagamento p = aceitaPagamento(valorTotal);
        recibo.addPagamento(pagamento);
    }

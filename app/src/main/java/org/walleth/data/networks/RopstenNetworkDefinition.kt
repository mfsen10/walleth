package org.walleth.data.networks

import org.kethereum.ETHEREUM_NETWORK_ROPSTEN
import org.kethereum.model.ChainDefinition

class RopstenNetworkDefinition : BaseNetworkDefinition() {

    override val etherscan_prefix = "ropsten"
    override val chain = ChainDefinition(3L)

    override fun getNetworkName() = ETHEREUM_NETWORK_ROPSTEN
    override val statsSuffix = ""
    override val bootNodes = listOf("enode://a24ac7c5484ef4ed0c5eb2d36620ba4e4aa13b8c84684e1b4aab0cebea2ae45cb4d375b77eab56516d34bfbd3c1a833fc51296ff084b770b94fb9028c4d25ccf@52.169.42.101:30303?discport=30304")
    override val genesis = """
{
    "config": {
        "chainId": 3,
        "homesteadBlock":0,
        "eip150Block":0,
        "eip155Block":10,
        "eip158Block":10,
        "eip160Block":10
    },
    "nonce": "0x0000000000000042",
    "alloc": {
        "0x0000000000000000000000000000000000000011": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000010": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000013": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000012": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000015": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000014": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000017": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000016": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000019": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000018": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c0": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c7": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c6": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c4": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002f": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c8": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000002c": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000091": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000090": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000093": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000092": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000095": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000094": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000097": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000096": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000076": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000c": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c3": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c2": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000081": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000a": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000024": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000025": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000026": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000027": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000020": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000021": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000022": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000023": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009a": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d7": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009b": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000028": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000029": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d0": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009f": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000001f": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000cc": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000cb": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ca": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000cf": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ce": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000cd": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000099": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000098": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ac": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000aa": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e9": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e8": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e4": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e7": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e6": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e0": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e3": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000e2": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000df": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000fb": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000fc": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000fd": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000fe": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ff": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ae": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000dd": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ad": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000de": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004f": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000db": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000004a": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000039": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000038": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000e": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000033": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000032": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000031": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000030": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000037": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000036": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000035": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000034": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f0": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f2": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f3": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f4": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f6": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f7": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f8": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000f9": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ee": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000c9": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ef": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ea": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ec": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000eb": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003f": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000003d": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000089": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000048": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000049": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000046": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000047": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000044": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000045": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000042": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000043": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000040": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000041": {
            "balance": "0"
        },
        "0x874b54a8bd152966d63f706bae1ffeb0411921e5": {
            "balance": "1000000000000000000000000000000"
        },
        "0x00000000000000000000000000000000000000af": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000088": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000d": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ed": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000006f": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000086": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000087": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000059": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000058": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000055": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000054": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000057": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000056": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000051": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000050": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000053": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000052": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000009d": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000dc": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000b": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000fa": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005f": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000005b": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000060": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000061": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000062": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000063": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000064": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000065": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000066": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000067": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000068": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000069": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000bd": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000be": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000bf": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ba": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000bb": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000bc": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008f": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000008e": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a0": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a3": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a2": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a4": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a7": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a6": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a9": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000a8": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000ab": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d8": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d9": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000077": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d6": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000075": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000074": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000073": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000072": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000071": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000070": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d4": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000079": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000078": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000002": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000003": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000000": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000001": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000006": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000007": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000004": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000005": {
            "balance": "1"
        },
        "0x00000000000000000000000000000000000000d2": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000008": {
            "balance": "1"
        },
        "0x0000000000000000000000000000000000000009": {
            "balance": "1"
        },
        "0x00000000000000000000000000000000000000d3": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b4": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b6": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b7": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b0": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b2": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b3": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000082": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000083": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000080": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d1": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b8": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000b9": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000084": {
            "balance": "0"
        },
        "0x0000000000000000000000000000000000000085": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007f": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007e": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007d": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007c": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007b": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000007a": {
            "balance": "0"
        },
        "0x000000000000000000000000000000000000000f": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000d5": {
            "balance": "0"
        },
        "0x00000000000000000000000000000000000000da": {
            "balance": "0"
        }
    },
    "timestamp": "0x00",
    "parentHash": "0x0000000000000000000000000000000000000000000000000000000000000000",
    "extraData": "0x3535353535353535353535353535353535353535353535353535353535353535",
    "gasLimit": "0x1000000",
    "difficulty": "0x100000",
    "mixhash": "0x0000000000000000000000000000000000000000000000000000000000000000",
    "coinbase": "0x0000000000000000000000000000000000000000"
}
        """

    override val statsUrl = ""

    override val infoUrl = "https://github.com/ethereum/ropsten"
}
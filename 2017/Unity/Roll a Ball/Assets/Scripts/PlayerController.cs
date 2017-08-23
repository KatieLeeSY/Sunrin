using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerController : MonoBehaviour
{

    private Rigidbody rb;
    public float speed;

    // Use this for initialization
    void Start()
    {
        rb = GetComponent<Rigidbody>();        // 소스코드랑 unity 플레이어 객체 연결
    }

    // Update is called once per frame
    void Update()
    {
        Debug.Log("Adfasdfasdf");
        float moveHorizontal = Input.GetAxis("Horizontal");     // 수평 받아오기
        float moveVertical = Input.GetAxis("Vertical");         // 수직 받아오기

        Vector3 movement = new Vector3(moveHorizontal, 0.0f, moveVertical);     // x,y,z
        rb.AddForce(movement * speed);      // 방향으로 힘을 가한다
    }
}

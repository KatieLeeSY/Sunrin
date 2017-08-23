using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour {

    public GameObject player;
    private Vector3 offset;     // 카메라와 플레이어 사이의 거리

	// Use this for initialization
	void Start () {
        offset = transform.position - player.transform.position;        // transform.position 카메라
	}
	
	// Update is called once per frame
	void Update () {
        transform.position = player.transform.position + offset;
	}
}
